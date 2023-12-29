package com.github.maoqis.android.base.component;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

import com.github.maoqis.android.base.view.CommonClickView;

public abstract class BaseCaseFragment extends BaseFragment {

    protected abstract @LayoutRes int getRLayout();

    protected CommonClickView addCommonTextView(String name, View.OnClickListener onClickListener) {
        return addCommonTextView(rootView, name, onClickListener);
    }

    public static CommonClickView addCommonTextView(View rootView, String name, View.OnClickListener onClickListener) {
        if (rootView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) rootView;
            CommonClickView child = new CommonClickView(rootView.getContext(), null);
            child.setOnClickListener(onClickListener);
            child.setText(name);
            viewGroup.addView(child);
            return child;
        } else {
            return null;
        }
    }

    protected View findSetOnClickListener(@IdRes int id, View.OnClickListener l) {
        View viewById = rootView.findViewById(id);
        viewById.setOnClickListener(l);
        return viewById;
    }
}
