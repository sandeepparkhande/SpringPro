# SpringPro

Add Plugin'

		<plugin>
				<groupId>com.spotify</groupId>
				<artifactId>docker-maven-plugin</artifactId>
				<configuration>
					<imageName>sandeep/corespringwebdemo</imageName>
					<baseImage>java:8</baseImage>
					<entryPoint>["java", "-jar", "/${project.build.finalName}.jar"]</entryPoint>
					<!-- copy the service's jar file from target into the root directory 
						of the image -->
					<resources>
						<resource>
							<targetPath>/</targetPath>
							<directory>${project.build.directory}</directory>
							<include>${project.build.finalName}.jar</include>
						</resource>
					</resources>
				</configuration>
			</plugin>

./mvnw docker:build 

docker images

docker run -it -p 80:8080 sandeep/corespringwebdemo

docker-machine env
