package co.lateralview.myapp.ui.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import co.lateralview.myapp.R;

public final class ToolbarUtils {

    private ToolbarUtils() {
    }

    public static void initializeToolbar(AppCompatActivity activity, boolean backEnabled,
            @Nullable String title) {
        Toolbar toolbar = activity.findViewById(R.id.toolbar);

        if (toolbar != null) {
            activity.setSupportActionBar(toolbar);

            setToolbarTitle(activity, title != null && !title.isEmpty() ? title : "");

            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(backEnabled);
            activity.getSupportActionBar().setHomeButtonEnabled(backEnabled);
        }
    }

    public static void setActionBarVisibility(Activity activity, int visibility) {
        Toolbar toolbar = activity.findViewById(R.id.toolbar);

        if (toolbar != null) {
            toolbar.setVisibility(visibility);
        }
    }

    public static void setToolbarTitle(AppCompatActivity activity, String title) {
        if (activity.getSupportActionBar() != null) {
            activity.getSupportActionBar().setTitle(title);
        }
    }

    public static ImageView findOverflowMenuButton(Activity activity, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        ImageView overflow = null;
        for (int i = 0, count = viewGroup.getChildCount(); i < count; i++) {
            View v = viewGroup.getChildAt(i);
            if (v instanceof ImageView && (v.getClass().getSimpleName().equals("OverflowMenuButton")
                    ||
                    v instanceof ActionMenuView.ActionMenuChildView)) {
                overflow = (ImageView) v;
            } else if (v instanceof ViewGroup) {
                overflow = findOverflowMenuButton(activity, (ViewGroup) v);
            }
            if (overflow != null) {
                break;
            }
        }
        return overflow;
    }
}
