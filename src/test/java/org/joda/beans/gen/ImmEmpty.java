/*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.BasicImmutableBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock immutable empty bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class ImmEmpty implements ImmutableBean {

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmEmpty}.
     * @return the meta-bean, not null
     */
    public static ImmEmpty.Meta meta() {
        return ImmEmpty.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmEmpty.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static ImmEmpty.Builder builder() {
        return new ImmEmpty.Builder();
    }

    private ImmEmpty() {
    }

    @Override
    public ImmEmpty.Meta metaBean() {
        return ImmEmpty.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    @Override
    public ImmEmpty clone() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(32);
        buf.append("ImmEmpty{");
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmEmpty}.
     */
    public static final class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null);

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        public ImmEmpty.Builder builder() {
            return new ImmEmpty.Builder();
        }

        @Override
        public Class<? extends ImmEmpty> beanType() {
            return ImmEmpty.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmEmpty}.
     */
    public static final class Builder extends BasicImmutableBeanBuilder<ImmEmpty> {

        /**
         * Restricted constructor.
         */
        private Builder() {
            super(ImmEmpty.Meta.INSTANCE);
        }

        //-----------------------------------------------------------------------
        @Override
        public Builder set(String propertyName, Object newValue) {
            throw new NoSuchElementException("Unknown property: " + propertyName);
        }

        @Override
        public ImmEmpty build() {
            return new ImmEmpty();
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            return "ImmEmpty.Builder{}";
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
