package hcmute.edu.vn.listviewadapterimage19110081;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {

    Context myContext;
    int myLayout;
    List<MonAn> arrayMonAn;

    public MonAnAdapter (Context context, int layout, List<MonAn> monAnList) {
        myContext = context;
        myLayout = layout;
        arrayMonAn = monAnList;

    }

    @Override
    public int getCount() {
        return arrayMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(myLayout, null);

        TextView txtTen = (TextView) view.findViewById (R.id. textViewTen);
        txtTen.setText (arrayMonAn.get (i).Ten);
        TextView txtGia = (TextView) view.findViewById (R.id. textViewGia);
        txtGia.setText (arrayMonAn.get (i).Gia + "");
        ImageView imgHinh = (ImageView) view.findViewById (R.id. imageViewHinh);
        imgHinh.setImageResource (arrayMonAn.get(i).Hinh);

        return view;
    }
}
