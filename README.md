# gRPCDemo
gRPC Hello World

This is a basic gRPC testing project.

### Requirements:

- java: 1.8 (amazon coretto)
- protoc: 3.17.2 - complier (binary -- needs to be added to PATH env var)
- protocArtifact: 3.17.2
- grpc: 1.40.1
- os.maven.plugin: 1.6.2 (generates os specific data)
- protobuf-maven-plugin: 0.6.1
- javax.annotation: 1.2

### Basic Setup Errors Encountered:
- protoc (external compiler) and protocArtifact(maven plugin tag) version must be same to avoid compilation issues.
- '@javax.annotation.Generated' symbol not found issue requires dependency: 
- ```
  <dependency>
     <groupId>javax.annotation</groupId>
     <artifactId>javax.annotation-api</artifactId>
     <version>1.2</version>
  </dependency>
- 'os.detected.classifier' in pom.xml is loaded via the following extension:
- ```
  <extension>
     <groupId>kr.motd.maven</groupId>
     <artifactId>os-maven-plugin</artifactId>
     <version>${os-maven-plugin.version}</version>
  </extension>

### IntelliJ Specific Resolutions:
- uncheck "Use '--release' option for cross-compilation (Java 9 and later ) in Setting "Build, Execution, Deployment > Compiler > Java Compiler" menu.




