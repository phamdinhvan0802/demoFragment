package com.example.fragmentss2;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentSVList extends ListFragment {

    ArrayList<Sv> arrSV;
    svAdapter adapter;
    TruyenSV truyenSV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        truyenSV = (TruyenSV) getActivity();

        arrSV = new ArrayList<>();
        addArrSV();
        adapter = new svAdapter(getActivity(), R.layout.row_sv, arrSV);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_sv, container, false);
    }

    private void addArrSV(){
        arrSV.add(new Sv("Phạm Đình Văn", "2001", "CNTT 42C"));
        arrSV.add(new Sv("Nguyễn Ích Nguyên", "2002", "CNTT 43A"));
        arrSV.add(new Sv("Huỳnh Nguyễn Ngọc Hải", "2003", "CNTT 44B"));
        arrSV.add(new Sv("Phan Hữu Quang", "2001", "CNTT 42B"));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSV.DataStudent(arrSV.get(position));
    }
}
