```
yay -S extra/jre17-openjdk-headless maven

git clone https://github.com/dagelf/touchgraph.git
cd touchgraph/
mvn clean install -Dmaven.javadoc.skip=true
java -cp ./touchgraph-wikibrowser/target/touchgraph-wikibrowser-1.02.jar:./touchgraph-graphlayout/target/touchgraph-graphlayout-1.22.jar com.touchgraph.wikibrowser.TGWikiBrowser meatball.txt http://www.usemod.com/cgi-bin/mb.pl? hypermedium 2 false
```

You can also compile with javadoc, but have to replace <tt></tt> tags with <code></code>.
Opens fine and builds out of the box on Netbeans 16.