package uk.gov.justice.digital.hmpps.templatepackagename

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/example")
class ExampleResource {

  @GetMapping("/test")
  fun testEndpoing(): String = "Test endpoint was called successfully."
}
