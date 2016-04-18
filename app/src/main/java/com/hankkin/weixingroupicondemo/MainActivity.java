package com.hankkin.weixingroupicondemo;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.hankkin.weixingroupicondemo.model.BitmapBean;
import com.hankkin.weixingroupicondemo.utils.BitmapUtils;
import com.hankkin.weixingroupicondemo.utils.PropertiesUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    private ImageView iv1, iv2, iv3, iv4, iv5, iv6;
    private List<BitmapBean> bitmapBeans1 = new ArrayList<>();
    private List<BitmapBean> bitmapBeans2 = new ArrayList<>();
    private List<BitmapBean> bitmapBeans3 = new ArrayList<>();
    private List<BitmapBean> bitmapBeans4 = new ArrayList<>();
    private List<BitmapBean> bitmapBeans5 = new ArrayList<>();
    private List<BitmapBean> bitmapBeans6 = new ArrayList<>();

    private String imgUrl = "http://avatar.csdn.net/2/9/C/1_jdsjlzx.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);

        initData();
        initNetData();
    }

    private void initNetData() {
        bitmapBeans6 = getBitmapEntitys(6);
        OkHttpUtils.get().url(imgUrl).build().execute(new BitmapCallback() {
            @Override
            public void onError(Call call, Exception e) {

            }

            @Override
            public void onResponse(Bitmap bitmap) {
                Bitmap[] bitmaps6 = {
                        ThumbnailUtils.extractThumbnail(bitmap, (int) bitmapBeans6
                        .get(0).getWidth(), (int) bitmapBeans6.get(0).getWidth()),
                        ThumbnailUtils.extractThumbnail(bitmap, (int) bitmapBeans6
                                .get(0).getWidth(), (int) bitmapBeans6.get(0).getWidth()),
                        ThumbnailUtils.extractThumbnail(bitmap, (int) bitmapBeans6
                                .get(0).getWidth(), (int) bitmapBeans6.get(0).getWidth()),
                        ThumbnailUtils.extractThumbnail(bitmap, (int) bitmapBeans6
                                .get(0).getWidth(), (int) bitmapBeans6.get(0).getWidth()),
                        ThumbnailUtils.extractThumbnail(bitmap, (int) bitmapBeans6
                                .get(0).getWidth(), (int) bitmapBeans6.get(0).getWidth()),
                        ThumbnailUtils.extractThumbnail(bitmap, (int) bitmapBeans6
                                .get(0).getWidth(), (int) bitmapBeans6.get(0).getWidth()),
                };
                Bitmap combineBitmap6 = BitmapUtils.getCombineBitmaps(bitmapBeans6, bitmaps6);
                iv6.setImageBitmap(combineBitmap6);

            }

            ;
        });

    }


    /**
     * 初始化数据
     * by Hankkin at:2015-11-19 21:59:03
     */
    private void initData() {
        /*获取四个图片数组*/
        bitmapBeans1 = getBitmapEntitys(1);
        bitmapBeans2 = getBitmapEntitys(2);
        bitmapBeans3 = getBitmapEntitys(3);
        bitmapBeans4 = getBitmapEntitys(4);
        bitmapBeans5 = getBitmapEntitys(5);


        /*压缩bitmap*/
        Bitmap[] bitmaps1 = {
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans1
                        .get(0).getWidth(), (int) bitmapBeans1.get(0).getWidth())};
        Bitmap[] bitmaps2 = {
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans2
                        .get(0).getWidth(), (int) bitmapBeans2.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans2
                        .get(0).getWidth(), (int) bitmapBeans2.get(0).getWidth())};
        Bitmap[] bitmaps3 = {
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans3
                        .get(0).getWidth(), (int) bitmapBeans3.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans3
                        .get(0).getWidth(), (int) bitmapBeans3.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans3
                        .get(0).getWidth(), (int) bitmapBeans3.get(0).getWidth())};
        Bitmap[] bitmaps4 = {
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans4
                        .get(0).getWidth(), (int) bitmapBeans4.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans4
                        .get(0).getWidth(), (int) bitmapBeans4.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans4
                        .get(0).getWidth(), (int) bitmapBeans4.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans4
                        .get(0).getWidth(), (int) bitmapBeans4.get(0).getWidth())};

        Bitmap[] bitmaps5 = {
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans5
                        .get(0).getWidth(), (int) bitmapBeans5.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans5
                        .get(0).getWidth(), (int) bitmapBeans5.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans5
                        .get(0).getWidth(), (int) bitmapBeans5.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans5
                        .get(0).getWidth(), (int) bitmapBeans5.get(0).getWidth()),
                ThumbnailUtils.extractThumbnail(BitmapUtils.getScaleBitmap(
                        getResources(), R.drawable.j), (int) bitmapBeans5
                        .get(0).getWidth(), (int) bitmapBeans5.get(0).getWidth()),

        };









        /*获取组合后的图片显示*/
        Bitmap combineBitmap1 = BitmapUtils.getCombineBitmaps(bitmapBeans1, bitmaps1);
        iv1.setImageBitmap(combineBitmap1);

        Bitmap combineBitmap2 = BitmapUtils.getCombineBitmaps(bitmapBeans2, bitmaps2);
        iv2.setImageBitmap(combineBitmap2);

        Bitmap combineBitmap3 = BitmapUtils.getCombineBitmaps(bitmapBeans3, bitmaps3);
        iv3.setImageBitmap(combineBitmap3);

        Bitmap combineBitmap4 = BitmapUtils.getCombineBitmaps(bitmapBeans4, bitmaps4);
        iv4.setImageBitmap(combineBitmap4);

        Bitmap combineBitmap5 = BitmapUtils.getCombineBitmaps(bitmapBeans5, bitmaps5);
        iv5.setImageBitmap(combineBitmap5);


    }


    /**
     * 获取图片数组实体
     * by Hankkin at:2015-11-19 22:00:55
     *
     * @param count
     * @return
     */
    private List<BitmapBean> getBitmapEntitys(int count) {
        List<BitmapBean> mList = new ArrayList<>();
        String value = PropertiesUtil.readData(this, String.valueOf(count),
                R.raw.data);
        String[] arr1 = value.split(";");
        int length = arr1.length;
        for (int i = 0; i < length; i++) {
            String content = arr1[i];
            String[] arr2 = content.split(",");
            BitmapBean entity = null;
            for (int j = 0; j < arr2.length; j++) {
                entity = new BitmapBean();
                entity.setX(Float.valueOf(arr2[0]));
                entity.setY(Float.valueOf(arr2[1]));
                entity.setWidth(Float.valueOf(arr2[2]));
                entity.setHeight(Float.valueOf(arr2[3]));
            }
            mList.add(entity);
        }
        return mList;
    }


}
