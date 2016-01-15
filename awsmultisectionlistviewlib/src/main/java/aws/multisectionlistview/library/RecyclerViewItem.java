package aws.multisectionlistview.library;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/**
 * Created by thinh on 1/14/16.
 */

public abstract class RecyclerViewItem
{
    protected abstract int getType();

    protected abstract RecyclerView.ViewHolder createViewHolder(Context context);

    protected abstract void bind(RecyclerView.ViewHolder holder);

    protected boolean isFullSpan()
    {
        return false;
    }
}
