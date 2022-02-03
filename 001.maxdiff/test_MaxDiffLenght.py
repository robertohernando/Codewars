import MaxDiffLength

# # Tests
# Test.describe("mxdiflg")
# Test.it("Basic tests")
def test_mxdiflg():
    s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
    s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
    assert MaxDiffLength.mxdiflg(s1, s2) == 13   