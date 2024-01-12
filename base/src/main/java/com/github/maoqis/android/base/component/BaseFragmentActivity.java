package com.github.maoqis.android.base.component;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public abstract class BaseFragmentActivity extends FragmentActivity {

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(getRLayout());
      onInitView();
   }

   protected abstract int getRLayout();



   protected abstract void onInitView();
}
