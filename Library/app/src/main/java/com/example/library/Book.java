package com.example.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class Book extends RecyclerView.Adapter<Book.listViewHolder> {

    final private ListItemClickListener mOnClickListener;

    private List<contain> nbooklist;

    public Book (List<contain> nbooklist,ListItemClickListener listener)
    {this.nbooklist=nbooklist;
      mOnClickListener = listener;
    }



    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }


    @NonNull
    @Override
    public listViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        Context context=parent.getContext();

        LayoutInflater inflater=LayoutInflater.from(context);

        View view=inflater.inflate(R.layout.booklist,parent,false);
        listViewHolder listv=new listViewHolder(view);
        return listv;
    }

    @Override
    public void onBindViewHolder( listViewHolder holder, int position) {
        int img=nbooklist.get(position).getImage();
        String txt=nbooklist.get(position).getText();
        holder.setdata(img,txt);
    }

    @Override
    public int getItemCount() {
        return nbooklist.size();
    }



    public class listViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imageView;
        private TextView textView;

        public listViewHolder( View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image1);
            textView=itemView.findViewById(R.id.text);
            itemView.setOnClickListener(this);
        }

        public void setdata(int img, String txt) {
            imageView.setImageResource(img);
            textView.setText(txt);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);

        }
    }
}
