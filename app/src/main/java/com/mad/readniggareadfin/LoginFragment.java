package com.mad.readniggareadfin;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LoginFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        startActivity(new Intent(this.getActivity(), LoginActivity.class));
        return inflater.inflate(R.layout.activity_login, container, false);
    }
}