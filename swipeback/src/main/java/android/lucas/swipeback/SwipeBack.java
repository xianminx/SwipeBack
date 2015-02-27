package android.lucas.swipeback;

import android.app.Activity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

import java.lang.reflect.Method;

/**
 * Created by lucas on 2/26/15.
 */
public class SwipeBack {

    private static final String TAG = SwipeBack.class.getName();

    public static boolean onTouchEvent(final Activity activity, MotionEvent event) {
        GestureDetector.OnGestureListener onGestureListener = new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                Log.d(TAG, String.format("onScroll(e1=%s, e2=%s, distanceX=%s, y=%s)", e1, e2, distanceX, distanceY));
                activity.getWindow().getDecorView().setX(e2.getX());
                //decorView.invalidate();
                return super.onScroll(e1, e2, distanceX, distanceY);
            }
        };
        GestureDetector gestureDetector = new GestureDetector(activity, onGestureListener);
        gestureDetector.onTouchEvent(event);
        return false;
    }
}
