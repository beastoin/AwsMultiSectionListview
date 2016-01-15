package aws.multisectionlistview.library;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thinh on 1/14/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    Context mContext;
    List<RecyclerViewItem> mItems;
    Map<Integer, RecyclerViewItem> mPrototypeItems;


    public RecyclerViewAdapter(Context context)
    {
        mContext = context;
        mItems = new ArrayList<>();
        mPrototypeItems = new HashMap<>();
    }

    @Override
    public int getItemCount()
    {
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position)
    {
        return getItem(position).getType();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        if (holder.itemView.getLayoutParams() == null)
        {
            layoutParams =
                    new StaggeredGridLayoutManager.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        else
        {
            layoutParams =
                    (StaggeredGridLayoutManager.LayoutParams) holder.itemView.getLayoutParams();
        }
        layoutParams.setFullSpan(isFullSpan(position));
        holder.itemView.setLayoutParams(layoutParams);

        getItem(position).bind(holder);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return getPrototypeItem(viewType).createViewHolder(mContext);
    }

    public boolean isFullSpan(int position)
    {
        return getItem(position).isFullSpan();
    }

    public RecyclerViewItem getItem(int position)
    {
        return mItems.get(position);
    }

    public RecyclerViewItem getPrototypeItem(int viewType)
    {
        return mPrototypeItems.get(viewType);
    }

    public RecyclerViewAdapter refresh(List<RecyclerViewItem> recyclerViewItems)
    {
        mItems = recyclerViewItems;
        mPrototypeItems.clear();
        for (RecyclerViewItem item : recyclerViewItems)
        {
            if (!mPrototypeItems.containsKey(item.getType()))
            {
                mPrototypeItems.put(item.getType(), item);
            }
        }
        notifyDataSetChanged();

        return this;
    }
}