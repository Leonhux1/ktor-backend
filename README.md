# ktor-backend #
### DESCRIPTION: ###
A ktor backend that recieves a single JSON object at the endpoint "/endpoint".
### INSTALLATION ###
-> The file structure of a ktor project can be generated online via the website start.ktor.io. When installing the project, the Routing plugin should be selected.  
After installation, the project should be opened in IntelliJ and the appropriateJDK should be selected. In the build.gradle.kts file, the following plugin should be added into the plugins section:  
`kotlin("plugin.serialization") version <"version">`  
  
  
-> In the dependencies section of the build.gradle.kts file, the following dependencies should be included:  
`implementation("io.ktor:ktor-serialization-kotlinx-cbor:$ktor_version")`  
`implementation("io.ktor:ktor-serialization-kotlinx-xml:$ktor_version")`  
`implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")`  
`implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")`  
  

-> In the Routing.kt file, the following import should be done:  
`import io.ktor.server.request.*`  
  

-> A data class should be created for serialization under `@kotlinx.serialization.Serializable`  
In the routing section, a get request should be created on a respective endpoint in which a Json object should be created and called.  
In the Application.kt file, the following imports should be done:  
`import io.ktor.server.plugins.contentnegotiation.*`  
`import io.ktor.serialization.kotlinx.json.*`  
`import io.ktor.server.application.*`  
`import io.ktor.server.application.hooks.CallFailed.install`  
  

-> Furthermore, ContentNegotiation should be installed under the embddedServer section and the json function should be called within the `install(ContentNegotiation)` block.
  
