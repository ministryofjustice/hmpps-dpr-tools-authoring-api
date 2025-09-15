package uk.gov.justice.digital.hmpps.dprtoolsauthoringapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DprToolsAuthoringApi

fun main(args: Array<String>) {
  runApplication<DprToolsAuthoringApi>(*args)
}
