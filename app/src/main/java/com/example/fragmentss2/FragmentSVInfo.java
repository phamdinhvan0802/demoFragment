package com.example.fragmentss2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentSVInfo extends Fragment {

    TextView txtHt, txtNS, txtLop;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sv_info,container,false);
        AnXa();
        return view;
    }
    private void AnXa(){
        txtHt = view.findViewById(R.id.txtName);
        txtNS = view.findViewById(R.id.txtNamSinh);
        txtLop = view.findViewById(R.id.txtLop);
    }
    public void setInfo(Sv sv){
        txtHt.setText(sv.getHoten());
        txtNS.setText("Năm sinh: " + sv.getNamsinh());
        txtLop.setText("Lớp: " + sv.getLop());
    }
}
