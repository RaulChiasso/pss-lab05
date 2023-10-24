plugins { 
    java 
    application
    checkstyle
    }
repositories { mavenCentral() } // Configura Gradle per cercare e scaricare da Maven Central
dependencies { // Elenco di librerie che ci servono
  implementation("com.omertron:API-OMDB:1.5")
}
application { // Configurazione dell'esecuzione, la main class è sufficiente
    mainClass.set("it.unibo.encapsulation.TestAllClasses")
}
