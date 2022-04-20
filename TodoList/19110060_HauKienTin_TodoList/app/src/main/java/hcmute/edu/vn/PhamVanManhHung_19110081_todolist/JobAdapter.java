package hcmute.edu.vn.PhamVanManhHung_19110081_todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class JobAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Job> jobList;

    public JobAdapter(Context context, int layout, List<Job> jobList) {
        this.context = context;
        this.layout = layout;
        this.jobList = jobList;
    }
    @Override
    public int getCount() {
        return jobList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtName;
        ImageView imgDelete;
        ImageView imgEdit;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtName      = (TextView) view.findViewById(R.id.textviewName);
            holder.imgDelete    = (ImageView) view.findViewById(R.id.imageviewDelete);
            holder.imgEdit      = (ImageView) view.findViewById(R.id.imageviewEdit);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        Job job = jobList.get(i);

        holder.txtName.setText(job.getJobName());

        return view;
    }
}
