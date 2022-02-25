# openapi-generator-demo
Demo project to generate server stub from <a href="https://github.com/OAI/OpenAPI-Specification">OpenAPI Spec</a>. 

More details are available at - <a href="https://github.com/OpenAPITools/openapi-generator">openapi-generator github</a> and <a href="https://openapi-generator.tech/">openapi-generator tech</a>.

## maven plugin
```
<build>
	<plugins>
		<plugin>
			<groupId>org.openapitools</groupId>
			<artifactId>openapi-generator-maven-plugin</artifactId>
			<version>5.4.0</version>
			<executions>
				<execution>
					<goals>
						<goal>generate</goal>
					</goals>
					<configuration>
						<inputSpec>
							${project.basedir}/src/main/resources/open-api-doc/open-api.json
						</inputSpec>

						<generatorName>spring</generatorName>

						<apiPackage>com.openapi.generator.demo.api</apiPackage>
						<modelPackage>com.openapi.generator.demo.model</modelPackage>
						<invokerPackage>com.openapi.generator.demo.invoker</invokerPackage>

						<addCompileSourceRoot>false</addCompileSourceRoot>
						<output>${project.basedir}</output>

						<generateApis>true</generateApis>
						<generateApiTests>true</generateApiTests>
						<generateModelTests>true</generateModelTests>

						<skipIfSpecIsUnchanged>false</skipIfSpecIsUnchanged>
						<skipOverwrite>true</skipOverwrite>

						<supportingFilesToGenerate>
							ApiUtil.java
						</supportingFilesToGenerate>

						<configOptions>
							<delegatePattern>true</delegatePattern>
							<documentationProvider>springdoc</documentationProvider>
						</configOptions>
					</configuration>
				</execution>
			</executions>
		</plugin>
	</plugins>
</build>
```

## Steps to generate classes
1. Generate API documentation. You can use <a href="https://editor.swagger.io/">Swagger editor</a> to generate API doc.
2. Upload generated API documentation in project base directory.
3. Add ``` openapi-generator-maven-plugin ``` in pom.xml. (Refer above mentioned pom.xml for plugin configurations)
4. execute maven goal ``` mvn clean install ```.
5. Model, controller, util, API classes will be generated at the location specified in ``` <output> ... </output> ```.
6. If the output location is not specified, by default classes are generated at ``` ${project.build.directory}/generated-sources/openapi ```.
7. You may have to add some other dependencies to avoid compilation error.
