package atomstudio.ksl.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import atomstudio.ksl.Post;
import atomstudio.ksl.R;
import atomstudio.ksl.item.ItemPost;

public class PostAdapter extends ArrayAdapter<ItemPost> {

    private Activity activity;
    private List<ItemPost> itemPosts;
    private ItemPost objItemPost;
    private int row;


    public PostAdapter(Activity activity, int resource, List<ItemPost> arrayList) {
        super(activity, resource, arrayList);
        this.activity = activity;
        this.row = resource;
        this.itemPosts = arrayList;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(row, null);

            holder = new ViewHolder();
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        if ((itemPosts == null) || ((position + 1) > itemPosts.size()))
            return view;

        objItemPost = itemPosts.get(position);

        holder.txtTitle=(TextView)view.findViewById(R.id.title);
        holder.txtTitle.setText(objItemPost.getTitle().toString());
        return view;

    }

    public class ViewHolder {


        public  TextView txtTitle;


    }
}
