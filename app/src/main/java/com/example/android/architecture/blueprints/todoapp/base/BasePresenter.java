/*
 * Copyright 2016, The Android Open Source Project
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
package com.example.android.architecture.blueprints.todoapp.base;

import android.arch.lifecycle.Lifecycle;

/**
 * Interface definition for a callback to be invoked when a view state changes.
 * @param <V> Generic View to Represent UI
 */
public interface BasePresenter<V extends BaseView>{
    void onViewAttached(V view);
    void onViewDetached();
    void onDestroyed();
}
