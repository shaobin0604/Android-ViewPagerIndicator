package com.viewpagerindicator.sample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.viewpagerindicator.ImageDotPageIndicator;

public class SampleImageDotInitialPage extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_image_dot);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (ImageDotPageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.setCurrentItem(mAdapter.getCount() - 1);

        //You can also do: indicator.setViewPager(pager, initialPage);
    }
}