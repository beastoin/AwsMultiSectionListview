package aws.multisectionlistview.library;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;

/**
 * Created by thinh on 1/14/16.
 */
public class MultiSectionListview extends RecyclerView
{
    int mColumnNumber;


    public MultiSectionListview(Context context)
    {
        super(context);
        init(context);
    }

    public MultiSectionListview(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public MultiSectionListview(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context)
    {
        mColumnNumber = 2;
        setLayoutManager(
                new StaggeredGridLayoutManager(mColumnNumber, StaggeredGridLayoutManager.VERTICAL));

    }

    public void setColumnNumber(int columnNumber)
    {
        mColumnNumber = columnNumber;
        setLayoutManager(
                new StaggeredGridLayoutManager(columnNumber, StaggeredGridLayoutManager.VERTICAL));
    }
}
