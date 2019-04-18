### Welcome to bitcoinj.cash

The bitcoinj.cash library is a Java implementation of the Bitcoin cash protocol. This library is a fork of Mike Hearn's original bitcoinj library aimed at supporting the Bitcoin cash eco-system.

It allows maintaining a wallet and sending/receiving transactions without needing a full blockchain node. It comes with full documentation and some example apps showing how to use it.

For support and discussion please join us on the [mailing list](https://groups.google.com/forum/#!forum/bitcoinj-cash).

Release notes are [here](docs/Releases.md).

### Technologies

* Java 7 for the core modules, Java 8 for everything else (also compiles and runs under JRE/JDK 11 or 12)
* [Maven 3+](http://maven.apache.org) - for building the project
* [Google Protocol Buffers](https://github.com/google/protobuf) - for use with serialization and hardware communications

### Getting started

To get started, it is best to have the latest JDK and Maven installed.

#### Building from the command line

To perform a full build use
```
mvn clean package
```
You can also run
```
mvn site:site
```
to generate a website with useful information like JavaDocs.

The outputs are under the `target` directory.

#### Building from an IDE

Alternatively, just import the project using your IDE. [IntelliJ](http://www.jetbrains.com/idea/download/) has Maven integration built-in and has a free Community Edition. Simply use `File | Import Project` and locate the `pom.xml` in the root of the cloned project source tree.

If using JDK 11 or above, the WalletTemplate demo you will JavaFX-SDK installed and referenced seperately. In IntelliJ, add javafx-lib path to File > Project Structure > Libraries. Under Run > Edit Configurations, add '--module-path "PATH_TO_FX" --add-modules=javafx.controls,javafx.fxml' to VM options. Replace PATH_TO_FX with javafx lib path, leaving the quotations.

### Example applications

These are found in the `examples` module.

#### Forwarding service

This will download the block chain and eventually print a Bitcoin address that it has generated.

If you send coins to that address, it will forward them on to the address you specified.

```
  cd examples
  mvn exec:java -Dexec.mainClass=org.bitcoinj.examples.ForwardingService -Dexec.args="<insert a bitcoin address here>"
```

Note that this example app *does not use checkpointing*, so the initial chain sync will be pretty slow. You can make an app that starts up and does the initial sync much faster by including a checkpoints file; see the documentation for
more info on this technique.

### Contributing to Bitcoinj Cash

Contributions to Bitcoinj Cash are welcome and encouraged.
