package io.petter.detekt.report

import io.gitlab.arturbosch.detekt.api.Detektion
import io.gitlab.arturbosch.detekt.api.OutputReport

class JsonReport : OutputReport() {
    override val ending: String = "json"

    override fun render(detektion: Detektion): String? {
        return "[\"Json test.\"]"
    }
}
