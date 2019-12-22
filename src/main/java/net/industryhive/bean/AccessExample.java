package net.industryhive.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andPcIsNull() {
            addCriterion("PC is null");
            return (Criteria) this;
        }

        public Criteria andPcIsNotNull() {
            addCriterion("PC is not null");
            return (Criteria) this;
        }

        public Criteria andPcEqualTo(Integer value) {
            addCriterion("PC =", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotEqualTo(Integer value) {
            addCriterion("PC <>", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcGreaterThan(Integer value) {
            addCriterion("PC >", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcGreaterThanOrEqualTo(Integer value) {
            addCriterion("PC >=", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLessThan(Integer value) {
            addCriterion("PC <", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLessThanOrEqualTo(Integer value) {
            addCriterion("PC <=", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcIn(List<Integer> values) {
            addCriterion("PC in", values, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotIn(List<Integer> values) {
            addCriterion("PC not in", values, "pc");
            return (Criteria) this;
        }

        public Criteria andPcBetween(Integer value1, Integer value2) {
            addCriterion("PC between", value1, value2, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotBetween(Integer value1, Integer value2) {
            addCriterion("PC not between", value1, value2, "pc");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNull() {
            addCriterion("Android is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNotNull() {
            addCriterion("Android is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidEqualTo(Integer value) {
            addCriterion("Android =", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotEqualTo(Integer value) {
            addCriterion("Android <>", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThan(Integer value) {
            addCriterion("Android >", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Android >=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThan(Integer value) {
            addCriterion("Android <", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThanOrEqualTo(Integer value) {
            addCriterion("Android <=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidIn(List<Integer> values) {
            addCriterion("Android in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotIn(List<Integer> values) {
            addCriterion("Android not in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidBetween(Integer value1, Integer value2) {
            addCriterion("Android between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotBetween(Integer value1, Integer value2) {
            addCriterion("Android not between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andIosIsNull() {
            addCriterion("ios is null");
            return (Criteria) this;
        }

        public Criteria andIosIsNotNull() {
            addCriterion("ios is not null");
            return (Criteria) this;
        }

        public Criteria andIosEqualTo(Integer value) {
            addCriterion("ios =", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotEqualTo(Integer value) {
            addCriterion("ios <>", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThan(Integer value) {
            addCriterion("ios >", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThanOrEqualTo(Integer value) {
            addCriterion("ios >=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThan(Integer value) {
            addCriterion("ios <", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThanOrEqualTo(Integer value) {
            addCriterion("ios <=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosIn(List<Integer> values) {
            addCriterion("ios in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotIn(List<Integer> values) {
            addCriterion("ios not in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosBetween(Integer value1, Integer value2) {
            addCriterion("ios between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotBetween(Integer value1, Integer value2) {
            addCriterion("ios not between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(Integer value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(Integer value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(Integer value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(Integer value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(Integer value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(Integer value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<Integer> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<Integer> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(Integer value1, Integer value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(Integer value1, Integer value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}