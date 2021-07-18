package co.za.darshanpillay.darshanportfolio;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import co.za.darshanpillay.darshanportfolio.databinding.ActivityRootLayoutBinding;

public class ActivityRoot extends AppCompatActivity {

    private ActivityRootLayoutBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityRootLayoutBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();

        final NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.app_root_destination_container);
        final NavController navigationController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(mBinding.appRootBottomNavigation, navigationController);
    }
}
