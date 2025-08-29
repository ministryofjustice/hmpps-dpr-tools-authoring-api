package uk.gov.justice.digital.hmpps.templatepackagename.integration

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ExampleResourceTest : IntegrationTestBase() {

  @Nested
  @DisplayName("GET /example/test")
  inner class TimeEndpoint {

    @Test
    fun `should return unauthorized if no token`() {
      webTestClient.get()
        .uri("/example/test")
        .exchange()
        .expectStatus()
        .isUnauthorized
    }

//    @Test
//    fun `should return forbidden if no role`() {
//      webTestClient.get()
//        .uri("/example/test")
//        .headers(setAuthorisation())
//        .exchange()
//        .expectStatus()
//        .isForbidden
//    }
//
//    @Test
//    fun `should return forbidden if wrong role`() {
//      webTestClient.get()
//        .uri("/example/test")
//        .headers(setAuthorisation(roles = listOf("ROLE_WRONG")))
//        .exchange()
//        .expectStatus()
//        .isForbidden
//    }

    @Test
    fun `should return OK`() {
      webTestClient.get()
        .uri("/example/test")
        .headers(setAuthorisation())
        .exchange()
        .expectStatus()
        .isOk
        .expectBody()
        .jsonPath("$").value<String> {
          assertThat(it).isEqualTo("Test endpoint was called successfully.")
        }
    }
  }
}
