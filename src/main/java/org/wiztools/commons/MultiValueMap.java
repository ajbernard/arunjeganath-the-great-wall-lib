/*
 * Copyright WizTools.org
 * Licensed under the Apache License, Version 2.0:
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package org.wiztools.commons;

import java.util.Collection;
import java.util.Set;

/**
 *
 * @author subwiz
 */
public interface MultiValueMap<K, V> {

    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    Collection<V> get(K key);

    boolean isEmpty();

    Set<K> keySet();

    Collection<V> put(K key, V value);

    Collection<V> remove(K key);

    int size();

    Collection<V> values();

}
