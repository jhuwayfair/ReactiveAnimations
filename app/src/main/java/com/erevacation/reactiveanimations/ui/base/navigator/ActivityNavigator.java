/*
 *
 *  * Copyright 2017 Kojadin
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.erevacation.reactiveanimations.ui.base.navigator;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class ActivityNavigator extends BaseNavigator {

    private final FragmentActivity mActivity;

    public ActivityNavigator(FragmentActivity activity) {
        mActivity = activity;
    }

    @Override
    final FragmentActivity getActivity() {
        return mActivity;
    }

    @Override
    final FragmentManager getChildFragmentManager() {
        throw new UnsupportedOperationException("Activities do not have a child fragment manager.");
    }
}
