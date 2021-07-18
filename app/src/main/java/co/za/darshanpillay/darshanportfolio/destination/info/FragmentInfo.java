package co.za.darshanpillay.darshanportfolio.destination.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import co.za.darshanpillay.darshanportfolio.databinding.FragmentInfoLayoutBinding;

public class FragmentInfo extends Fragment {
    private final static String TAG = "FragmentInfo.Destination";
    private FragmentInfoLayoutBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        mBinding = FragmentInfoLayoutBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.title.setText(TAG);
    }

    @Override
    public void onDestroyView() {
        mBinding = null;
        super.onDestroyView();
    }

}
