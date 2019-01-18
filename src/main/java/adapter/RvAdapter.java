package adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    String imgUrl = "https://www.static-src.com/siva/asset/01_2019/KG_Carousel-Mobile17.jpg" ;

    private List<String> dataList;
    private static final int BANNER = 0;
    private static final int TEXTVIEWER = 1;
    public RvAdapter(List<String> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            // Banner
        if (getItemViewType(i) == 0) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_banner, viewGroup, false);
            return new ImageViewHolder(view);
        }
        else{
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item, viewGroup, false);
            return new TextViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        // Since it was a generic type we had to typecast it ...
        if (getItemViewType(i) == 0){

            ((ImageViewHolder)viewHolder).bind(imgUrl);
        }
        else{

            ((TextViewHolder)viewHolder).bind(dataList.get(i-1));
        }
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getItemViewType(int position) {
         if (position == 0){
             return 0;
         }
         else{
             return 1;
         }
    }

    class TextViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTitle;
        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }

        public void bind(String dataString){
            tvTitle.setText(dataString);

        }
    }

    class ImageViewHolder extends RecyclerView.ViewHolder{

        private ImageView tvTitle;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.adBanner);
        }

        public void bind(String dataString){

           tvTitle = itemView.findViewById(R.id.adBanner);
           Glide.with(tvTitle.getContext()).load(imgUrl).into(tvTitle);

        }
    }
}