(defproject clj-nd4j "0.1.0-SNAPSHOT"
  :description "An implementation of core.matrix protocols with nd4j."
  :url "https://github.com/whilo/clj-nd4j"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [net.mikera/core.matrix "0.62.0"]
                 [org.nd4j/nd4j-jblas "0.4-rc3.6"]
                 #_[org.nd4j/jcublas "6.5"]
                 #_[org.nd4j/nd4j-jcublas-6.5 "0.0.3.5.5.6-SNAPSHOT"]]
  
   :profiles {:dev {:java-source-paths ["src/test/java"]
                    :dependencies [[net.mikera/cljunit "0.6.0"]
                                   [net.mikera/core.matrix "0.62.0" :classifier "tests"]]}}
  
  )
