// Copyright (c) 2020 Facebook, Inc. and its affiliates.
// All rights reserved.
//
// This source code is licensed under the BSD-style license found in the
// LICENSE file in the root directory of this source tree.

package org.pytorch.demo.objectdetection;

import android.graphics.Rect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PrePostProcessor {
    // for yolov5 model, no need to apply MEAN and STD
    static float[] NO_MEAN_RGB = new float[] {0.0f, 0.0f, 0.0f};
    static float[] NO_STD_RGB = new float[] {1.0f, 1.0f, 1.0f};

    // model input image size
    static int mInputWidth = 640;
    static int mInputHeight = 640;

}
