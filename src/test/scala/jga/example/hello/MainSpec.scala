package jga.example.hello

import org.scalatest.matchers.should.Matchers
import org.scalatest.flatspec.AnyFlatSpec

class MainSpec extends AnyFlatSpec with Matchers
{
	"five" should "equal five" in {
		val expected = 5
		val actual = 5
		expected should equal(actual)
	}

	it should "not equal four" in {
		val expected = 5
		val actual = 4
		expected should not equal(actual)
	}
}
