import unittest

class MyFirstTest(unittest.TestCase):

    def test_first(self):
        self.assertEqual(1,2)

if __name__ == '__main__':
    unittest.main()
