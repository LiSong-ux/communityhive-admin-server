package net.industryhive.bean;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andBanAccountIsNull() {
            addCriterion("banAccount is null");
            return (Criteria) this;
        }

        public Criteria andBanAccountIsNotNull() {
            addCriterion("banAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBanAccountEqualTo(Boolean value) {
            addCriterion("banAccount =", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountNotEqualTo(Boolean value) {
            addCriterion("banAccount <>", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountGreaterThan(Boolean value) {
            addCriterion("banAccount >", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banAccount >=", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountLessThan(Boolean value) {
            addCriterion("banAccount <", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountLessThanOrEqualTo(Boolean value) {
            addCriterion("banAccount <=", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountIn(List<Boolean> values) {
            addCriterion("banAccount in", values, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountNotIn(List<Boolean> values) {
            addCriterion("banAccount not in", values, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountBetween(Boolean value1, Boolean value2) {
            addCriterion("banAccount between", value1, value2, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banAccount not between", value1, value2, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicIsNull() {
            addCriterion("banSubmitTopic is null");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicIsNotNull() {
            addCriterion("banSubmitTopic is not null");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicEqualTo(Boolean value) {
            addCriterion("banSubmitTopic =", value, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicNotEqualTo(Boolean value) {
            addCriterion("banSubmitTopic <>", value, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicGreaterThan(Boolean value) {
            addCriterion("banSubmitTopic >", value, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitTopic >=", value, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicLessThan(Boolean value) {
            addCriterion("banSubmitTopic <", value, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitTopic <=", value, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicIn(List<Boolean> values) {
            addCriterion("banSubmitTopic in", values, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicNotIn(List<Boolean> values) {
            addCriterion("banSubmitTopic not in", values, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitTopic between", value1, value2, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitTopic not between", value1, value2, "banSubmitTopic");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyIsNull() {
            addCriterion("banSubmitReply is null");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyIsNotNull() {
            addCriterion("banSubmitReply is not null");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyEqualTo(Boolean value) {
            addCriterion("banSubmitReply =", value, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyNotEqualTo(Boolean value) {
            addCriterion("banSubmitReply <>", value, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyGreaterThan(Boolean value) {
            addCriterion("banSubmitReply >", value, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitReply >=", value, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyLessThan(Boolean value) {
            addCriterion("banSubmitReply <", value, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitReply <=", value, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyIn(List<Boolean> values) {
            addCriterion("banSubmitReply in", values, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyNotIn(List<Boolean> values) {
            addCriterion("banSubmitReply not in", values, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitReply between", value1, value2, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanSubmitReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitReply not between", value1, value2, "banSubmitReply");
            return (Criteria) this;
        }

        public Criteria andBanMessageIsNull() {
            addCriterion("banMessage is null");
            return (Criteria) this;
        }

        public Criteria andBanMessageIsNotNull() {
            addCriterion("banMessage is not null");
            return (Criteria) this;
        }

        public Criteria andBanMessageEqualTo(Boolean value) {
            addCriterion("banMessage =", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageNotEqualTo(Boolean value) {
            addCriterion("banMessage <>", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageGreaterThan(Boolean value) {
            addCriterion("banMessage >", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banMessage >=", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageLessThan(Boolean value) {
            addCriterion("banMessage <", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageLessThanOrEqualTo(Boolean value) {
            addCriterion("banMessage <=", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageIn(List<Boolean> values) {
            addCriterion("banMessage in", values, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageNotIn(List<Boolean> values) {
            addCriterion("banMessage not in", values, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageBetween(Boolean value1, Boolean value2) {
            addCriterion("banMessage between", value1, value2, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banMessage not between", value1, value2, "banMessage");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicIsNull() {
            addCriterion("deleteTopic is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicIsNotNull() {
            addCriterion("deleteTopic is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicEqualTo(Boolean value) {
            addCriterion("deleteTopic =", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicNotEqualTo(Boolean value) {
            addCriterion("deleteTopic <>", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicGreaterThan(Boolean value) {
            addCriterion("deleteTopic >", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteTopic >=", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicLessThan(Boolean value) {
            addCriterion("deleteTopic <", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteTopic <=", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicIn(List<Boolean> values) {
            addCriterion("deleteTopic in", values, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicNotIn(List<Boolean> values) {
            addCriterion("deleteTopic not in", values, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteTopic between", value1, value2, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteTopic not between", value1, value2, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyIsNull() {
            addCriterion("deleteReply is null");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyIsNotNull() {
            addCriterion("deleteReply is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyEqualTo(Boolean value) {
            addCriterion("deleteReply =", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyNotEqualTo(Boolean value) {
            addCriterion("deleteReply <>", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyGreaterThan(Boolean value) {
            addCriterion("deleteReply >", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteReply >=", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyLessThan(Boolean value) {
            addCriterion("deleteReply <", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteReply <=", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyIn(List<Boolean> values) {
            addCriterion("deleteReply in", values, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyNotIn(List<Boolean> values) {
            addCriterion("deleteReply not in", values, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteReply between", value1, value2, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteReply not between", value1, value2, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andLockTopicIsNull() {
            addCriterion("lockTopic is null");
            return (Criteria) this;
        }

        public Criteria andLockTopicIsNotNull() {
            addCriterion("lockTopic is not null");
            return (Criteria) this;
        }

        public Criteria andLockTopicEqualTo(Boolean value) {
            addCriterion("lockTopic =", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicNotEqualTo(Boolean value) {
            addCriterion("lockTopic <>", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicGreaterThan(Boolean value) {
            addCriterion("lockTopic >", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockTopic >=", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicLessThan(Boolean value) {
            addCriterion("lockTopic <", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("lockTopic <=", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicIn(List<Boolean> values) {
            addCriterion("lockTopic in", values, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicNotIn(List<Boolean> values) {
            addCriterion("lockTopic not in", values, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopic between", value1, value2, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopic not between", value1, value2, "lockTopic");
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