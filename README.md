
###常用注解介绍
这里简单说下lombok实现的原理：主要是通过抽象语法树(AST)，在编译处理后，匹配到有其注解的类，
那么注解编译器就会自动去匹配项目中的注解对应到在lombok语法树中的注解文件，并经过自动编译匹
配来生成对应类中的getter或者setter方法，达到简化代码的目的。  
###@Getter / @Setter： 
可以作用在类上和属性上，放在类上，会对所有的非静态(non-static)属性生成Getter/Setter方法，放在属性上，会对该属性生成Getter/Setter方法。并可以指定Getter/Setter方法的访问级别。 
###@EqualsAndHashCode ： 
默认情况下，会使用所有非瞬态(non-transient)和非静态(non-static)字段来生成equals和hascode方法，也可以指定具体使用哪些属性。 @ToString 生成toString方法，默认情况下，会输出类名、所有属性，属性会按照顺序输出，以逗号分割。 
###@NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor： 
无参构造器、部分参数构造器、全参构造器 

###@Data： 
包含@ToString, @EqualsAndHashCode, 所有属性的@Getter, 所有non-final属性的@Setter和@RequiredArgsConstructor的组合，通常情况下，基本上使用这个注解就足够了。 

###@Budilder： 
可以进行Builder方式初始化。 

###@Slf4j：  
等同于：private final Logger logger = LoggerFactory.getLogger(XXX.class);简直不能更爽了！一般上用在其他java类上