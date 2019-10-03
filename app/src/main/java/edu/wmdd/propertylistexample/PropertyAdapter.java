package edu.wmdd.propertylistexample;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.ViewHolder> {

    private Context context;
    private List<Property> list;

    public PropertyAdapter(Context context, List<Property> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Property property = list.get(position);

        holder.textSummary.setText(property.getSummary());
        holder.textRating.setText(String.valueOf(property.getRating()));
        holder.textId.setText(String.valueOf(property.getId()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textSummary, textRating, textId;

        public ViewHolder(View itemView) {
            super(itemView);

            textSummary = itemView.findViewById(R.id.main_summary);
            textRating = itemView.findViewById(R.id.main_rating);
            textId = itemView.findViewById(R.id.main_id);
        }
    }

}