require 'minitest/autorun'

class MyTestClass < Minitest::Test

  def test_first
    assert_equal(1, 2)
  end

end
