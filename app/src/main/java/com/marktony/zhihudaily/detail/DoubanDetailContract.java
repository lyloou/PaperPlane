package com.marktony.zhihudaily.detail;

import android.webkit.WebView;

import com.marktony.zhihudaily.BasePresenter;
import com.marktony.zhihudaily.BaseView;

/**
 * Created by Lizhaotailang on 2016/9/17.
 */

public interface DoubanDetailContract {

    interface View extends BaseView<Presenter> {

        void showLoading();

        void stopLoading();

        void setTitle(String title);

        void showResult(String result);

        void showLoadError();

        void showShareError();

        void showMainImage(String imageUrl);

        void setWebViewImageMode(boolean showImage);

        void showBrowserNotFoundError();

        void showTextCopied();

        void showCopyTextError();

    }

    interface Presenter extends BasePresenter {

        void setId(int id);

        void loadResult(int id);

        void shareAsText();

        void openInBrowser();

        void openUrl(WebView webView, String url);

        void reload();

        void copyText();

        void copyLink();

        void addToOrDeleteFromBookmarks();

    }

}
