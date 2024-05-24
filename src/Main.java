import pattern.create.builder.Car;
import pattern.create.builder.CarBuilder;
import pattern.create.factory.Animal;
import pattern.create.factory.Factory;
import pattern.create.prototype.Shape;
import pattern.create.prototype.ShapeCache;
import pattern.create.singleton.Singleton2;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        /**
         * 1 UML类图的六种关系:
         *  1.1 泛化(generalization): 子类继承父类，父类是子类的泛化
         *  1.2 实现(realization): 类实现接口
         *  1.3 关联(association): 类中的某个属性是另一个类的实例(对象)
         *  1.4 聚合(aggregation): 聚合是类中多个属性是其他多个类的实例
         *  1.5 组合(composition): 组合代码实现是就是关联，但这种关联是不可拆分
         *  1.6 依赖(dependency): 依赖是类中的方法调用其他类中的方法
         *
         * 2 设计模式
         *  2.1 创建型(共5个): 灵活高效创建对象
         * 	 2.1.1 单例模式 Singleton Pattern
         *   2.1.2 原型模式 Prototype Pattern
         *   2.1.3 工厂模式 Factory Pattern
         *   2.1.4 抽象工厂模式 Abstract Factory Pattern
         *   2.1.5 建造者模式 Builder Pattern
         *
         *  2.2 结构型(共7个): 组合类和对象以形成更大的结构
         *   2.2.1 适配器模式 Adapter Pattern
         *   2.2.2 组合模式 Composite Pattern
         *   2.2.3 装饰器模式 Decorator Pattern
         *   2.2.4 外观模式 Facade Pattern
         *   2.2.5 享元模式 Flyweight Pattern
         *   2.2.6 代理模式 Proxy Pattern
         *   2.2.7 桥接模式 Bridge Pattern
         *
         *  2.3 行为型(共11个): 处理类和对象之间的通信和控制流
         *   2.3.1 责任链模式 Chain of Responsibility Pattern
         *   2.3.2 命令模式 Command Pattern
         *   2.3.3 解释器模式 Interpreter Pattern
         *   2.3.4 迭代器模式 Iterator Pattern
         *   2.3.5 观察者模式 Observer Pattern
         *   2.3.6 状态模式 State Pattern
         *   2.3.7 模板模式 Template Pattern
         *   2.3.8 中介者模式 Mediator Pattern
         *   2.3.9 备忘录模式 Memento Pattern
         *   2.3.10 访问者模式 Visitor Pattern
         *   2.3.11 策略模式 Strategy Pattern
         *
         *  2.4 其他
         *   2.4.1 过滤器模式 Filter Pattern
         *   2.4.2 空对象模式 Null Object Pattern
         *
         * 3 设计模式的六大原则
         *  3.1 单一职责原则(SRP): 一个类只应该有一个引起他变化的原因
         *  3.2 开放封闭原则(OCP): 对扩展开放，对修改关闭
         *  3.3 里氏替换原则(LSP): 子类型必须能够替换掉它们的父类型
         *  3.4 依赖倒置原则(DIP): 高层要依赖于低层，具体要依赖于抽象
         *  3.5 接口隔离原则(ISP): 接口的抽象功能尽可能要小
         *  3.6 迪米特法则(LOD): 一个对象应该对其他对象尽可能少的了解
         */
        /*单例模式*/
//		System.out.println(Singleton2.getInstance());
        /*原型模式*/
//		ShapeCache.loadCache();
//		Shape cloneShape = ShapeCache.getShape("1");
//		System.out.println("Shape:"+cloneShape.getType());
//		Shape cloneShape2 = ShapeCache.getShape("2");
//		System.out.println("Shape:"+cloneShape2.getType());
        /*工厂模式*/
//        Animal dog = Factory.createAnimal("dog");
//        dog.sound();
//        Animal cat = Factory.createAnimal("sss");
//        cat.sound();
        /*建造者模式*/
//        CarBuilder carBuilder = new CarBuilder();
//        carBuilder.setEngine("丰田发动机").setSeats(7).setYear(2023);/*链式调用方法*/
//        Car car = carBuilder.build();
//        System.out.println(car.toString());
    }
}