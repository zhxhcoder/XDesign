/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhxh.autosize;

import android.app.Activity;
import android.app.Application;

/**
 * ================================================
 * 屏幕适配逻辑策略类, 可通过 {@link AutoSizeConfig#init(Application, boolean, AutoAdaptStrategy)}
 * 和 {@link AutoSizeConfig#setAutoAdaptStrategy(AutoAdaptStrategy)} 切换策略
 *
 * @see DefaultAutoAdaptStrategy
 * Created by JessYan on 2018/8/9 15:13
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public interface AutoAdaptStrategy {

    /**
     * 开始执行屏幕适配逻辑
     *
     * @param activity 需要屏幕适配的 {@link Activity}
     */
    void applyAdapt(Activity activity);
}
