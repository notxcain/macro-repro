# Scala Meta Macro inspection bug

Scala Plugin Version: Nightly 2017.3.193  
IntelliJ Idea Version: EAP 2017.3

### Steps to reproduce
1. Clone project
1. Open in Idea
1. Got to `src/main/scala/repro/Bad.scala`
1. See line `20`. `bad.bar("1")` is inferred to `F[Unit]`, should be `Future[Unit]` as on line `23`
