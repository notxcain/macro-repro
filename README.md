# Scala Meta Macro expansion bug

### Steps to reproduce
1. Clone project
2. Open in Idea 2017.1 (Scala Plugin Nightly 2017.1.710)
3. Got to `src/main/scala/repro/Adder.scala`
4. Try to expand `@algebra` annotation
5. See error message
```
Macro expansion failed: java.lang.NoSuchMethodError: scala.Some.value()Ljava/lang/Object;
```
