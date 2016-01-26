package com.decor.item;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.chethanseenappa.mydecor.R;
import com.decor.item.model.DecorItem;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ChethanSeenappa on 1/23/2016.(
 */
public class DecorListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.individual_category_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());
        View recyclerView = findViewById(R.id.decor_individual_category_list);
        setupCardView((RecyclerView) recyclerView);
    }

    private void setupCardView(@NonNull RecyclerView cardView) {
        DecorItem decorItem = new DecorItem();
        HashMap itemDetail = new HashMap();
        itemDetail.put("name", "First Painting");
        itemDetail.put("range", "1000 - 2000");
        itemDetail.put("dimension", "3ft * 5ft");
        itemDetail.put("seller", "Chethan");
        itemDetail.put("description", "Some random painting");
        decorItem.addItem(itemDetail);
        itemDetail = new HashMap();
        itemDetail.put("name", "Second Painting");
        itemDetail.put("range", "10000 - 20000");
        itemDetail.put("dimension", "30ft * 50ft");
        itemDetail.put("seller", "Vimal");
        itemDetail.put("description", "Random painting, created to test the size of text which can be displayed for description.    ");
        decorItem.addItem(itemDetail);
        List decorItems = decorItem.getItems();
        System.out.println(decorItems.size());
        cardView.setAdapter(new ListCardViewAdapter(decorItems));
    }

    public class ListCardViewAdapter
            extends RecyclerView.Adapter<ListCardViewAdapter.ViewHolder> {

        private final List<DecorItem.Item> mValues;

        public ListCardViewAdapter(List<DecorItem.Item> items) {
            mValues = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.individual_item_card_view, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            System.out.println("list activity on bind view with position:   "+position);
            System.out.println("----------------holder-----------------"+holder.toString());
            System.out.println("----------------holder.mContentView-----------------"+holder.mContentView);
            holder.mItem = mValues.get(position);
            holder.mContentView.setText(mValues.get(position).toString());
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, DecorDetailActivity.class);
                    intent.putExtra("List", "first item");
                    context.startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final TextView mContentView;
            public DecorItem.Item mItem;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mContentView = (TextView) view.findViewById(R.id.item_name);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + mContentView.getText() + "'";
            }
        }
    }


}
