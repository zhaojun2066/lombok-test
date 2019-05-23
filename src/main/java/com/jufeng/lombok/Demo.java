package com.jufeng.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Demo {
    String code;
    String name;
}


/***
 *
 *
 *  等同于下面手写
 * public class Demo {
 *         String code;
 *         String name;
 *
 *         public static DemoBuilder builder() {
 *             return new DemoBuilder();
 *         }
 *
 *         public String getCode() {
 *             return this.code;
 *         }
 *
 *         public String getName() {
 *             return this.name;
 *         }
 *
 *         public void setCode(String code) {
 *             this.code = code;
 *         }
 *
 *         public void setName(String name) {
 *             this.name = name;
 *         }
 *
 *         public boolean equals(Object o) {
 *             if (o == this)
 *                 return true;
 *             if (!(o instanceof Demo))
 *                 return false;
 *             Demo other = (Demo) o;
 *             if (!other.canEqual(this))
 *                 return false;
 *             Object this$code = getCode();
 *             Object other$code = other.getCode();
 *             if (this$code == null ? other$code != null : !this$code.equals(other$code))
 *                 return false;
 *             Object this$name = getName();
 *             Object other$name = other.getName();
 *             return this$name == null ? other$name == null : this$name.equals(other$name);
 *         }
 *
 *         protected boolean canEqual(Object other) {
 *             return other instanceof Demo;
 *         }
 *
 *         public int hashCode() {
 *             int PRIME = 59;
 *             int result = 1;
 *             Object $code = getCode();
 *             result = result * 59 + ($code == null ? 43 : $code.hashCode());
 *             Object $name = getName();
 *             return result * 59 + ($name == null ? 43 : $name.hashCode());
 *         }
 *
 *         public String toString() {
 *             return "Demo(code=" + getCode() + ", name=" + getName() + ")";
 *         }
 *
 *         public Demo() {
 *         }
 *
 *         public Demo(String code, String name) {
 *             this.code = code;
 *             this.name = name;
 *         }
 *
 *         public static class DemoBuilder {
 *             private String code;
 *             private String name;
 *
 *             public DemoBuilder code(String code) {
 *                 this.code = code;
 *                 return this;
 *             }
 *
 *             public DemoBuilder name(String name) {
 *                 this.name = name;
 *                 return this;
 *             }
 *
 *             public Demo build() {
 *                 return new Demo(this.code, this.name);
 *             }
 *
 *             public String toString() {
 *                 return "Demo.DemoBuilder(code=" + this.code + ", name=" + this.name + ")";
 *             }
 *         }
 *     }
 */
