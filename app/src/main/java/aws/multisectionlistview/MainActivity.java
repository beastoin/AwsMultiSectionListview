package aws.multisectionlistview;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import aws.multisectionlistview.library.MultiSectionListview;
import aws.multisectionlistview.library.RecyclerViewAdapter;
import aws.multisectionlistview.library.RecyclerViewItem;

public class MainActivity extends AppCompatActivity
{
    int mColumnNum = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Sample here
        final MultiSectionListview recyclerView = (MultiSectionListview) findViewById(R.id.recycler_view);
        recyclerView.setColumnNumber(2);
        final RecyclerViewAdapter adapter1 = new RecyclerViewAdapter(this);
        recyclerView.setAdapter(adapter1);
        adapter1.refresh(new ArrayList<RecyclerViewItem>()
        {
            {
                add(new TextRecycleViewItem("Header 01"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new TextRecycleViewItem("Header 02"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.YELLOW));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new TextRecycleViewItem("Header 03"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new TextRecycleViewItem("Header 04"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new TextRecycleViewItem("Footer"));
            }
        });
        final RecyclerViewAdapter adapter2 = new RecyclerViewAdapter(this);
        adapter2.refresh(new ArrayList<RecyclerViewItem>()
        {
            {
                add(new TextRecycleViewItem("Header 011"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new TextRecycleViewItem("Header 012"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.YELLOW));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new TextRecycleViewItem("Header 013"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new TextRecycleViewItem("Header 014"));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GRAY));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.GREEN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.CYAN));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.MAGENTA));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.BLUE));
                add(new ImageRecycleViewItem(new Random().nextInt(1000) % 501 + 50, Color.RED));
                add(new TextRecycleViewItem("Footer1"));
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mColumnNum++;
                if (mColumnNum > 5)
                    mColumnNum = 1;

                recyclerView.setColumnNumber(mColumnNum);
                if (mColumnNum % 2 == 0)
                {
                    recyclerView.setAdapter(adapter1);
                }
                else
                {
                    recyclerView.setAdapter(adapter2);
                }
            }
        });

    }


    enum RecyclerViewType
    {
        TEXT, IMAGE, COMBINE
    }

    class TextRecycleViewItem extends RecyclerViewItem
    {
        String mTextValue;


        public TextRecycleViewItem(String value)
        {
            mTextValue = value;
        }

        @Override
        protected int getType()
        {
            return RecyclerViewType.TEXT.hashCode();
        }

        @Override
        protected boolean isFullSpan()
        {
            return true;
        }

        @Override
        protected RecyclerView.ViewHolder createViewHolder(Context context)
        {
            TextView textView = new TextView(context);
            textView.setTextColor(Color.RED);

            return new TextRecycleViewItemViewHolder(textView);
        }

        @Override
        protected void bind(RecyclerView.ViewHolder holder)
        {
            TextRecycleViewItemViewHolder textRecycleViewItemViewHolder =
                    (TextRecycleViewItemViewHolder) holder;
            textRecycleViewItemViewHolder.mTextView.setText(mTextValue);
        }


        class TextRecycleViewItemViewHolder extends RecyclerView.ViewHolder
        {
            TextView mTextView;

            public TextRecycleViewItemViewHolder(View itemView)
            {
                super(itemView);
                mTextView = (TextView) itemView;
            }
        }
    }

    class ImageRecycleViewItem extends RecyclerViewItem
    {
        int mHeight;
        int mColor;


        public ImageRecycleViewItem(int height, int color)
        {
            mHeight = height;
            mColor = color;
        }

        @Override
        protected int getType()
        {
            return RecyclerViewType.IMAGE.hashCode();
        }

        @Override
        protected boolean isFullSpan()
        {
            return false;
        }

        @Override
        protected RecyclerView.ViewHolder createViewHolder(Context context)
        {
            FrameLayout frameLayout = new FrameLayout(context);

            ImageView imageView = new ImageView(context);
            frameLayout.setPadding(4, 4, 4, 4);

            frameLayout.addView(imageView);

            return new TextRecycleViewItemViewHolder(frameLayout);
        }

        @Override
        protected void bind(RecyclerView.ViewHolder holder)
        {
            TextRecycleViewItemViewHolder textRecycleViewItemViewHolder =
                    (TextRecycleViewItemViewHolder) holder;
            textRecycleViewItemViewHolder.mImageView.setBackgroundColor(mColor);
            textRecycleViewItemViewHolder.mImageView.setLayoutParams(
                    new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, mHeight));
        }


        class TextRecycleViewItemViewHolder extends RecyclerView.ViewHolder
        {
            ImageView mImageView;

            public TextRecycleViewItemViewHolder(View itemView)
            {
                super(itemView);
                mImageView = (ImageView) ((ViewGroup) itemView).getChildAt(0);
            }
        }
    }
}
