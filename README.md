# SpringPro

Add Plugin'

			<plugin>
				<groupId>com.spotify</groupId>
				<artifactId>docker-maven-plugin</artifactId>
				<version>0.4.11</version>

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

Install Docker Tool Bax
Install Amazon CLI

./mvnw docker:build 

docker images

docker run -it -p 80:8080 sandeep/corespringwebdemo

docker-machine env

http://ec2-54-149-132-31.us-west-2.compute.amazonaws.com/product
