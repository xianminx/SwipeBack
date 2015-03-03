# SwipeBack

Navigate back to the previous Activity by Swipe Gesture from the left edge of the screen.

## Demo


## Usage

* Add dependency

```groovy
    compile 'android.lucas:swipeback:0.0.1'
```

* Add Application's or Activity's theme.


```xml
<!-- file  ./app/src/main/res/values/styles.xml -->
<!-- Base application theme. -->
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    <item name="android:windowIsTranslucent">true</item>
    <item name="android:windowBackground">@android:color/transparent</item>
    <!-- Customize your theme here. -->
</style>
```

```xml
<application
        android:theme="@style/AppTheme" >
```

* For the activity your want to support SwipeBack gesture, add the following code:

```java
public class MainActivity extends ActionBarActivity {
    private static final String TAG = MainActivity.class.getName();
    private SwipeBack mSwipeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwipeBack = new SwipeBack(this);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return mSwipeBack.onTouchEvent(ev) || super.dispatchTouchEvent(ev);
    }
```
