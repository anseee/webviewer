/*
 * Copyright Fobid. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tfc.webviewer.presenter;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import android.widget.PopupWindow;

/**
 * author @Fobid
 */
public interface IWebViewPresenter {
    void onBackPressed(PopupWindow menu, WebView webView);

    void onReceivedTitle(String title, String url);

    void onClickClose();

    void onClickMenu(PopupWindow menu);

    void setEnabledGoBackAndGoFoward(boolean enabledGoBack, boolean enabledGoFoward);

    void onClickGoBack();

    void onClickGoFoward();

    void onClickCopyLink(Context context, String url);

    void onClickOpenBrowser(Uri uri);

    void onClickShare(String url);
}
