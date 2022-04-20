package hcmute.edu.vn.todolist19110081;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class JobAdapter extends BaseAdapter {
    private MainActivity context;
    private int layout;
    private List<Job> jobList;

    public JobAdapter(MainActivity context, int layout, List<Job> jobList) {
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
            holder.txtName      = (TextView) view.findViewById(R.id.textviewNameJob);
            holder.imgDelete    = (ImageView) view.findViewById(R.id.imageviewDelete);
            holder.imgEdit      = (ImageView) view.findViewById(R.id.imageviewEdit);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        final Job job = jobList.get(i);

        holder.txtName.setText(job.getJobName());

        // bắt sự kiện xóa & sửa
        holder.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.DialogSuaCongViec(job.getJobName(),job.getJobId());

            }
        });

        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.DialogXoaCV(job.getJobName(), job.getJobId());
            }
        });

        return view;
    }

}
