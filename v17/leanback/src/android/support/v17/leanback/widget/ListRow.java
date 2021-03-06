/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package android.support.v17.leanback.widget;

/**
 * A row composed of a optional {@link HeaderItem}, and an {@link ObjectAdapter}
 * describing children.
 */
public class ListRow extends Row {
    private final ObjectAdapter mAdapter;

    /**
     * Get the {@link ObjectAdapter} that represents a list of objects.
     */
    public final ObjectAdapter getAdapter() {
        return mAdapter;
    }

    public ListRow(HeaderItem header, ObjectAdapter adapter) {
        super(header);
        mAdapter = adapter;
        verify();
    }

    public ListRow(long id, HeaderItem header, ObjectAdapter adapter) {
        super(id, header);
        mAdapter = adapter;
        verify();
    }

    public ListRow(ObjectAdapter adapter) {
        super();
        mAdapter = adapter;
        verify();
    }

    private void verify() {
        if (mAdapter == null) {
            throw new IllegalArgumentException("ObjectAdapter cannot be null");
        }
    }
}
